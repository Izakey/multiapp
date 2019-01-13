package com.isaac.launcher;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class MicroservicesStarter {
	private static final List<Backend> activeBackends = new ArrayList<>();

	public MicroservicesStarter() {
	}

	public static void startBackends() throws Exception {
		
		startBackend("first", "com.isaac.first.backendRunner.FirstServiceBackendRunner");
		startBackend("second", "com.isaac.second.backendRunner.SecondServiceBackendRunner");
		startBackend("third", "com.isaac.third.backendRunner.ThirdServiceBackendRunner");
	}

	private static void startBackend(final String backendProjectName, final String backendClassName) throws Exception {
		//URL backendRunnerUrl = new File("../YagnaCommonRest/target/classes").toURI().toURL();
		URL runnerUrl = new File("../" + backendProjectName + "/build/classes/java/main").toURI().toURL();
		
		URL[] urls = new URL[] { runnerUrl };
		
		URLClassLoader cl = new URLClassLoader(urls, MicroservicesStarter.class.getClassLoader());
		Class<?> runnerClass = cl.loadClass(backendClassName);
		
		Object runnerInstance = runnerClass.newInstance();

		final Backend backend = new Backend(runnerClass, runnerInstance);
		activeBackends.add(backend);

		runnerClass.getMethod("run").invoke(runnerInstance);
	}

	public static void stopAllBackends()
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		for (Backend b : activeBackends) {
			b.runnerClass.getMethod("stop").invoke(b.runnerInstance);
		}
	}

	private static class Backend {
		private Class<?> runnerClass;
		private Object runnerInstance;

		public Backend(final Class<?> runnerClass, final Object runnerInstance) {
			this.runnerClass = runnerClass;
			this.runnerInstance = runnerInstance;
		}
	}
}