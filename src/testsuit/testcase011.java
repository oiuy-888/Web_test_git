package testsuit;

public class testcase011 extends base_testcase{

    public static int case_count=0;
	
	public testcase011() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_008";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_report_with_0org1acc_within7d_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
