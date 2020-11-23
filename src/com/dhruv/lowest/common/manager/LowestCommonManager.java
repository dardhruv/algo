package com.dhruv.lowest.common.manager;

import java.util.List;

public class LowestCommonManager {

    public static OrgChart getLowestCommonManager(
            OrgChart topManager,OrgChart reportOne,OrgChart reportTwo
    ){
        int val = 0;
        return getLCM(topManager,val,reportOne,reportTwo);
    }
    static class OrgChart{
        public char name;
        public List<OrgChart> directReports;

        public OrgChart(char name,List<OrgChart> directReports){
            this.name = name;
            this.directReports = directReports;
        }
    }

    private static OrgChart getLCM(OrgChart parentNode,int val,OrgChart reportOne,OrgChart reportTwo){
        int count = 0;
        while(count <= parentNode.directReports.size()){
            OrgChart result = getLCM(parentNode.directReports.get(count),val,reportOne,reportTwo);
            if(val == 2)
                return result;
        }
        if(parentNode == reportOne || parentNode == reportTwo){
            val += 1;
        }
        return null;
    }
}
