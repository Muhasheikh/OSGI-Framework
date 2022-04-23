package stationaryStoreproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import managerService.ManagerService;
import managerService.ManagerServiceImpl;

public class Activator implements BundleActivator {
	
	@SuppressWarnings("rawtypes")
	ServiceRegistration serviceRegisterer;
	

	public void start(BundleContext context) throws Exception {
		
		System.out.println("============Stationary Store service started.============");
		ManagerService managerSer = new ManagerServiceImpl();
		serviceRegisterer = context.registerService(ManagerService.class.getName(), managerSer, null);
	
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("==============Stationary Store closed.=============");
		serviceRegisterer.unregister();
	}

}
