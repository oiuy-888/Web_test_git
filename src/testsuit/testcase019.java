package testsuit;

public class testcase019 extends base_testcase{

    public static int case_count=0;
	
	public testcase019() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="GRADE_012";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_grade_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
