sap.ui.define([
    "sap/ui/core/mvc/Controller",
    "sap/ui/model/json/JSONModel",
    "jquery.sap.global"
],
    /**
     * @param {typeof sap.ui.core.mvc.Controller} Controller
     */
    function (Controller,JSONModel,jQuery) {
        "use strict";

        return Controller.extend("project1.controller.Main", {
            onInit: function () {
                var oData = {
                    
                       "id" : "",
                       "CpmanyName" : "",    
                       "ContactName" : "",
                       "fisrtName" : "",
                       "lastName" : "",
                       "middleName" : "",
                       "status" : "",
                       "regNo" : "",
                       "Phone" : "",
                       "email" : "",
                       "country" : "",
                       "city" : ""
                       


                    
                 };
                 var oModel = new sap.ui.model.json.JSONModel(oData);
                 sap.ui.getCore().setModel(oModel, "Initial");
            },
            onCreateVendor : function(){
                var oRouter = this.getOwnerComponent().getRouter();
            oRouter.navTo("RouteCreate");
            },
            onSearchVendor : function(){
                var oRouter = this.getOwnerComponent().getRouter();
            oRouter.navTo("RouteSearch");
            }
        });
    });
