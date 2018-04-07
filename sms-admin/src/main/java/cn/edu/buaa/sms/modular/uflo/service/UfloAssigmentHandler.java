package cn.edu.buaa.sms.modular.uflo.service;

import com.bstek.uflo.env.Context;
import com.bstek.uflo.model.ProcessInstance;
import com.bstek.uflo.process.handler.AssignmentHandler;
import com.bstek.uflo.process.node.TaskNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;


/**
 * The type Uflo assigment handler.
 * 指定一个Bean  来完成操作人
 */
@Component("UfloAssigmentHandler")
public class UfloAssigmentHandler implements AssignmentHandler {
    @Override
    public Collection<String> handle(TaskNode taskNode, ProcessInstance processInstance, Context context) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("test1");
        return coll;
    }
}
