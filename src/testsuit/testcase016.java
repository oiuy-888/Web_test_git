package testsuit;

public class testcase016 extends base_testcase{

    public static int case_count=0;
	
	public testcase016() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_043-2";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_1grade_personal_report_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
