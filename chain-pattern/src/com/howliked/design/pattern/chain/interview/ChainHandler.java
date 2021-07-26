package com.howliked.design.pattern.chain.interview;

import java.util.ArrayList;
import java.util.List;

public class ChainHandler {
    private List<InterViewHandler> interViewHandlerList = new ArrayList<>();

    public void addHandler(List<InterViewHandler> interViewHandlerList) {
        this.interViewHandlerList.addAll(interViewHandlerList);
    }

    //public void doHandler(Candidate candidate) {
    //    for (InterViewHandler handler : interViewHandlerList) {
    //        handler.handlerRequest(candidate);
    //    }
    //}

    public boolean doHandler(Candidate candidate) {
        for (InterViewHandler handler : interViewHandlerList) {
            if (!handler.handlerRequest(candidate)) {
                return false;
            }
        }
        return true;
    }
}
