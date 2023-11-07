sap.ui.define([
    "sap/ui/core/mvc/Controller",
    "sap/ui/model/json/JSONModel",
    "project1/util/backendService",
    "sap/m/MessageBox",
],
    /**
     * @param {typeof sap.ui.core.mvc.Controller} Controller
     */
    function (Controller,JSONModel,backendService,MessageBox) {
        "use strict";

        return Controller.extend("project1.controller.Detail", {
            onInit: function () {
                var oData =sap.ui.getCore().getModel("Initial").oData;
                var oModel = new sap.ui.model.json.JSONModel(oData);
                this.getView().setModel(oModel,"initial")
                
                debugger
            },
            onCreateSingle : function(oEvent){
            var that = this;
               var postData = this.getView().getModel('initial').getData();
                //Create a post call for create here using Ajax at server 
                 backendService.callService("/vendor","POST",postData).then(function(data){
                //var oModel = new sap.ui.model.json.JSONModel(data);
               MessageBox.information("Vendor is created successfully : "+data.Id+" as ID", {
				actions: [MessageBox.Action.OK],
				emphasizedAction: MessageBox.Action.OK,
				onClose: function (sAction) {
					var oRouter = that.getOwnerComponent().getRouter();
            		oRouter.navTo("RouteMain");
            		var oDatainti = {
                    
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
            		that.getView().getModel('initial').setData(oDatainti);
				}
			});
                debugger
                //that.getView().setModel(oModel,"TableDataModel");
                }).catch(function(err){
                
                });
            }
        });
    });
