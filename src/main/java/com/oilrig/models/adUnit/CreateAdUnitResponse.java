package com.oilrig.models.adUnit;

public class CreateAdUnitResponse {
	private DataParams data;

    public void setData(DataParams data){
        this.data = data;
    }
    public DataParams getData(){
        return this.data;
    }
    
    
    public class DataParams
    {
        private BudgetIntervalParams BudgetInterval;

        public void setBudgetInterval(BudgetIntervalParams BudgetInterval){
            this.BudgetInterval = BudgetInterval;
        }
        public BudgetIntervalParams getBudgetInterval(){
            return this.BudgetInterval;
        }
    }
    
    public class BudgetIntervalParams
    {
        private int id;
        private String start_date;
        private String end_date;
        private int lifetime_budget_revenue;
        private int lifetime_budget_imps;
        private int ad_unit_id;
        private String updatedAt;
        private String createdAt;
        private String xandr_budget_interval_id;
        private boolean xandr_update_status;
        private String user_id;

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return this.id;
        }
        public void setStart_date(String start_date){
            this.start_date = start_date;
        }
        public String getStart_date(){
            return this.start_date;
        }
        public void setEnd_date(String end_date){
            this.end_date = end_date;
        }
        public String getEnd_date(){
            return this.end_date;
        }
        public void setLifetime_budget_revenue(int lifetime_budget_revenue){
            this.lifetime_budget_revenue = lifetime_budget_revenue;
        }
        public int getLifetime_budget_revenue(){
            return this.lifetime_budget_revenue;
        }
        public void setLifetime_budget_imps(int lifetime_budget_imps){
            this.lifetime_budget_imps = lifetime_budget_imps;
        }
        public int getLifetime_budget_imps(){
            return this.lifetime_budget_imps;
        }
        public void setAd_unit_id(int ad_unit_id){
            this.ad_unit_id = ad_unit_id;
        }
        public int getAd_unit_id(){
            return this.ad_unit_id;
        }
        public void setUpdatedAt(String updatedAt){
            this.updatedAt = updatedAt;
        }
        public String getUpdatedAt(){
            return this.updatedAt;
        }
        public void setCreatedAt(String createdAt){
            this.createdAt = createdAt;
        }
        public String getCreatedAt(){
            return this.createdAt;
        }
        public void setXandr_budget_interval_id(String xandr_budget_interval_id){
            this.xandr_budget_interval_id = xandr_budget_interval_id;
        }
        public String getXandr_budget_interval_id(){
            return this.xandr_budget_interval_id;
        }
        public void setXandr_update_status(boolean xandr_update_status){
            this.xandr_update_status = xandr_update_status;
        }
        public boolean getXandr_update_status(){
            return this.xandr_update_status;
        }
        public void setUser_id(String user_id){
            this.user_id = user_id;
        }
        public String getUser_id(){
            return this.user_id;
        }
    }
}