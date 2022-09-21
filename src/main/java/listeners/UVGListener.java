package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import utils.GlobalVariables;

public class UVGListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite started");
        GlobalVariables.apiHost = suite.getParameter("apiHost");
        GlobalVariables.seleniumHost = suite.getParameter("seleniumHost");
        System.out.println(GlobalVariables.seleniumHost + " <------");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite finished");
    }
}
