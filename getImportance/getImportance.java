package com.OJ;

import java.util.HashMap;
import java.util.List;
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
public class getImportance {

    public int getImportance(List<Employee> employees, int id) {
        if(employees.isEmpty()){
            return 0;
        }
        HashMap<Integer,Employee> map=new HashMap<>();
        for(Employee es:employees){
            map.put(es.id,es);
        }
        return DFS(id,map);
    }
    public  int DFS(int id, HashMap<Integer,Employee> map){
        int ret=map.get(id).importance;
        for(int subid:map.get(id).subordinates){
            ret+=DFS(subid,map);
        }
        return ret;
    }
}
