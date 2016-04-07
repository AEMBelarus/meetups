/**
 * Tabs
 */
(function(module){

    var Tabs = {
        tabs: [
            'config',
            'xTab1','xTab2','xTab3','xTab4',
            'yTab1','yTab2','yTab3', 'yTab4',
            'zTab1','zTabs2','zTab3', 'zTab4'
        ],
        configs: [
            {id:'v_1', tabs:[1,2,3,4]},
            {id:'v_2', tabs:[5,6,7,8]},
            {id:'v_3', tabs:[9,10,11,12]}
        ],
        tabPanelName: "tabpanel"
    };

    /**
     * Looking for config by configField value
     * @param value
     * @returns {*}
     */
    var findConfig = function(value){
        var config = null;

        for(var i= 0,length = Tabs.configs.length; i<length;i++ ){
            if(Tabs.configs[i].id == value){
                config = Tabs.configs[i];
                break;
            }
        }

        return config;
    };

    /**
     * Manages the tabs of the specified tab panel.
     * Tabs which allowed into config will be shown,
     * the others will be hidden.
     */
    Tabs.manageTabs = function(tabPanel, configFieldValue) {
        var config = configFieldValue ? findConfig(configFieldValue) : null;

        for (var i = 1; i != Tabs.tabs.length; i++) {
            if (config && config.tabs.indexOf(i) >= 0) {
                tabPanel.unhideTabStripItem(i);
            } else {
                tabPanel.hideTabStripItem(i);
            }
        }
    };

    if(module){
        module.Tabs = Tabs;
    } else{
        return {
            Tabs: Tabs
        }
    }
})(DD);
