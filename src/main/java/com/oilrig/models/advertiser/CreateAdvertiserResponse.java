package com.oilrig.models.advertiser;

public class CreateAdvertiserResponse {

	private DataParams data;

	public void setData(DataParams data) {
		this.data = data;
	}

	public DataParams getData() {
		return this.data;
	}

	public class DataParams {
		private AdvertiserParams advertiser;

		public void setAdvertiser(AdvertiserParams advertiser) {
			this.advertiser = advertiser;
		}

		public AdvertiserParams getAdvertiser() {
			return this.advertiser;
		}
	}

	public class AdvertiserParams {
		private int id;
		private String name;
		private String state;
		private String updatedAt;
		private String createdAt;
		private int xandr_advertiser_id;
		private boolean xandr_update_status;
		private String user_id;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getState() {
			return this.state;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setXandr_advertiser_id(int xandr_advertiser_id) {
			this.xandr_advertiser_id = xandr_advertiser_id;
		}

		public int getXandr_advertiser_id() {
			return this.xandr_advertiser_id;
		}

		public void setXandr_update_status(boolean xandr_update_status) {
			this.xandr_update_status = xandr_update_status;
		}

		public boolean getXandr_update_status() {
			return this.xandr_update_status;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getUser_id() {
			return this.user_id;
		}
	}
}