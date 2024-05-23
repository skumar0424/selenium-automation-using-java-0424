package seleniumtests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

public class TestNGListenerRetry implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
		annotation.setRetryAnalyzer(RetryListener.class);
	}

	@Override
	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}

	@Override
	public void transform(IDataProviderAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, method);
	}

	@Override
	public void transform(IFactoryAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, method);
	}

	@Override
	public void transform(IListenersAnnotation annotation, Class<?> testClass) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass);
	}

}
