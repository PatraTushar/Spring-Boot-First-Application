package Example3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganizationInfo {


    @Value("${org.emp.count:245}")
    private int orgEmpCount;


    @Value("${org.dept.Names}")
    private List<String> deptNames;

    public List<String> getDeptNames() {
        return deptNames;
    }

    public void setDeptNames(List<String> deptNames) {
        this.deptNames = deptNames;
    }

    public int getOrgEmpCount() {
        return orgEmpCount;
    }

    public void setOrgEmpCount(int orgEmpCount) {
        this.orgEmpCount = orgEmpCount;
    }
}
