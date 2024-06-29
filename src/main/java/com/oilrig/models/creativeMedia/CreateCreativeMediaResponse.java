package com.oilrig.models.creativeMedia;

public class CreateCreativeMediaResponse {
	private DataParams data;

    public void setData(DataParams data){
        this.data = data;
    }
    public DataParams getData(){
        return this.data;
    }
    
    
    public class DataParams
    {
        private CreativeMediaParams creativeMedia;

        public void setCreativeMedia(CreativeMediaParams creativeMedia){
            this.creativeMedia = creativeMedia;
        }
        public CreativeMediaParams getCreativeMedia(){
            return this.creativeMedia;
        }
    }
    
    public class CreativeMediaParams
    {
        private int id;

        private String media_url;

        private String file_type;

        private int width;

        private int height;

        private int duration;

        private int creative_id;

        private String updatedAt;

        private String createdAt;

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return this.id;
        }
        public void setMedia_url(String media_url){
            this.media_url = media_url;
        }
        public String getMedia_url(){
            return this.media_url;
        }
        public void setFile_type(String file_type){
            this.file_type = file_type;
        }
        public String getFile_type(){
            return this.file_type;
        }
        public void setWidth(int width){
            this.width = width;
        }
        public int getWidth(){
            return this.width;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return this.height;
        }
        public void setDuration(int duration){
            this.duration = duration;
        }
        public int getDuration(){
            return this.duration;
        }
        public void setCreative_id(int creative_id){
            this.creative_id = creative_id;
        }
        public int getCreative_id(){
            return this.creative_id;
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
    }

}