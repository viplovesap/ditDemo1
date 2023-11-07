sap.ui.define([
    "sap/ui/core/mvc/Controller",
    "sap/ui/model/json/JSONModel",
    "jquery.sap.global",
    "project1/util/backendService"
    
    
],
    /**
     * @param {typeof sap.ui.core.mvc.Controller} Controller
     */
    function (Controller,JSONModel,jQuery,backendService) {
        "use strict";

        return Controller.extend("project1.controller.Main", {
            onInit: function () {
				var that= this;
                
                backendService.callService("/vendor","GET",{}).then(function(data){
                var oModel = new sap.ui.model.json.JSONModel(data);
                
                that.getView().setModel(oModel,"TableDataModel");
                }).catch(function(err){
                
                });
                
                
            }
        });
    });
