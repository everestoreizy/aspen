/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oreizy.everest.xaspen.dependencies;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 *
 * @author eoreizy
 */
public class JSONRT implements ResponseTransformer {

    final static private Gson gson = new Gson();
    
    @Override
    public String render(Object o) throws Exception {
        return gson.toJson(o);
    }
    
}
