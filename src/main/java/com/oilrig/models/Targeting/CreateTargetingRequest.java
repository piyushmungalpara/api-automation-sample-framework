package com.oilrig.models.Targeting;

import java.util.List;
import java.util.Set;

public class CreateTargetingRequest {
	private CityParams city;
	private CountryParams country;
	private RegionParams region;
	private DMAParams dma;
	private LanguageParams language;
	private DeviceTypeParams device_type;
	private OSTypeParams os_type;
	private BrowserParams browser;
	private SegmentParams segment;
	private SellerNetworkParams seller_network;
	private PlayerSizeParams player_size;
	private VisibilityTypeParams visibility_type;
	private DaypartTargetParams daypart_target;
	private InventoryListParams inventory_list;
	private String zip_code_file;
	
	
/*	public List<CityParams> getCity() {
		return city;
	}

	public void setCity(List<CityParams> city) {
		this.city = city;
	}

	public List<CountryParams> getCountry() {
		return country;
	}

	public void setCountry(List<CountryParams> country) {
		this.country = country;
	}

	public List<RegionParams> getRegion() {
		return region;
	}

	public void setRegion(List<RegionParams> region) {
		this.region = region;
	}

	public List<DMAParams> getDma() {
		return dma;
	}

	public void setDma(List<DMAParams> dma) {
		this.dma = dma;
	}

	public List<LanguageParams> getLanguage() {
		return language;
	}

	public void setLanguage(List<LanguageParams> language) {
		this.language = language;
	}

	public List<DeviceTypeParams> getDevice_type() {
		return device_type;
	}

	public void setDevice_type(List<DeviceTypeParams> device_type) {
		this.device_type = device_type;
	}

	public List<OSTypeParams> getOs_type() {
		return os_type;
	}

	public void setOs_type(List<OSTypeParams> os_type) {
		this.os_type = os_type;
	}

	public List<BrowserParams> getBrowser() {
		return browser;
	}

	public void setBrowser(List<BrowserParams> browser) {
		this.browser = browser;
	}

	public List<SegmentParams> getSegment() {
		return segment;
	}

	public void setSegment(List<SegmentParams> segment) {
		this.segment = segment;
	}

	public List<SellerNetworkParams> getSeller_network() {
		return seller_network;
	}

	public void setSeller_network(List<SellerNetworkParams> seller_network) {
		this.seller_network = seller_network;
	}

	public List<PlayerSizeParams> getPlayer_size() {
		return player_size;
	}

	public void setPlayer_size(List<PlayerSizeParams> player_size) {
		this.player_size = player_size;
	}

	public List<VisibilityTypeParams> getVisibility_type() {
		return visibility_type;
	}

	public void setVisibility_type(List<VisibilityTypeParams> visibility_type) {
		this.visibility_type = visibility_type;
	}

	public List<DaypartTargetParams> getDaypart_target() {
		return daypart_target;
	}

	public void setDaypart_target(List<DaypartTargetParams> daypart_target) {
		this.daypart_target = daypart_target;
	}

	public List<InventoryListParams> getInventory_list() {
		return inventory_list;
	}

	public void setInventory_list(List<InventoryListParams> inventory_list) {
		this.inventory_list = inventory_list;
	}
	
	public void setZip_code_file(String zip_code_file){
        this.zip_code_file = zip_code_file;
    }
    public String getZip_code_file(){
        return this.zip_code_file;
    }
*/
//	public List<ZipCodeFileParams> getZip_code_file() {
//		return zip_code_file;
//	}
//
//	public void setZip_code_file(List<ZipCodeFileParams> zip_code_file) {
//		this.zip_code_file = zip_code_file;
//	}

	public CityParams getCity() {
		return city;
	}

	public void setCity(CityParams city) {
		this.city = city;
	}

	public CountryParams getCountry() {
		return country;
	}

	public void setCountry(CountryParams country) {
		this.country = country;
	}

	public RegionParams getRegion() {
		return region;
	}

	public void setRegion(RegionParams region) {
		this.region = region;
	}

	public DMAParams getDma() {
		return dma;
	}

	public void setDma(DMAParams dma) {
		this.dma = dma;
	}

	public LanguageParams getLanguage() {
		return language;
	}

	public void setLanguage(LanguageParams language) {
		this.language = language;
	}

	public DeviceTypeParams getDevice_type() {
		return device_type;
	}

	public void setDevice_type(DeviceTypeParams device_type) {
		this.device_type = device_type;
	}

	public OSTypeParams getOs_type() {
		return os_type;
	}

	public void setOs_type(OSTypeParams os_type) {
		this.os_type = os_type;
	}

	public BrowserParams getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserParams browser) {
		this.browser = browser;
	}

	public SegmentParams getSegment() {
		return segment;
	}

	public void setSegment(SegmentParams segment) {
		this.segment = segment;
	}

	public SellerNetworkParams getSeller_network() {
		return seller_network;
	}

	public void setSeller_network(SellerNetworkParams seller_network) {
		this.seller_network = seller_network;
	}

	public PlayerSizeParams getPlayer_size() {
		return player_size;
	}

	public void setPlayer_size(PlayerSizeParams player_size) {
		this.player_size = player_size;
	}

	public VisibilityTypeParams getVisibility_type() {
		return visibility_type;
	}

	public void setVisibility_type(VisibilityTypeParams visibility_type) {
		this.visibility_type = visibility_type;
	}

	public DaypartTargetParams getDaypart_target() {
		return daypart_target;
	}

	public void setDaypart_target(DaypartTargetParams daypart_target) {
		this.daypart_target = daypart_target;
	}

	public InventoryListParams getInventory_list() {
		return inventory_list;
	}

	public void setInventory_list(InventoryListParams inventory_list) {
		this.inventory_list = inventory_list;
	}

	public String getZip_code_file() {
		return zip_code_file;
	}

	public void setZip_code_file(String zip_code_file) {
		this.zip_code_file = zip_code_file;
	}

	public class CityParams {
		private String action;
		private Set<String> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<String> getParams() {
			return params;
		}

		public void setParams(Set<String> params) {
			this.params = params;
		}

	}

	public class CountryParams {
		private String action;
		private Set<String> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<String> getParams() {
			return params;
		}

		public void setParams(Set<String> params) {
			this.params = params;
		}

	}

	public class RegionParams {
		private String action;

	    private List<CountryAndRegionCode> params;

	    public void setAction(String action){
	        this.action = action;
	    }
	    public String getAction(){
	        return this.action;
	    }
	    public void setParams(List<CountryAndRegionCode> params){
	        this.params = params;
	    }
	    public List<CountryAndRegionCode> getParams(){
	        return this.params;
	    }

	}
	
	public class CountryAndRegionCode
	{
	    private String country_code;

	    private String region_code;

	    public void setCountry_code(String country_code){
	        this.country_code = country_code;
	    }
	    public String getCountry_code(){
	        return this.country_code;
	    }
	    public void setRegion_code(String region_code){
	        this.region_code = region_code;
	    }
	    public String getRegion_code(){
	        return this.region_code;
	    }
	}

	public class DMAParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class LanguageParams {
		private String action;
		private Set<String> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<String> getParams() {
			return params;
		}

		public void setParams(Set<String> params) {
			this.params = params;
		}

	}

	public class DeviceTypeParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class OSTypeParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class BrowserParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class SegmentParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class SellerNetworkParams {
		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class PlayerSizeParams {
		private Set<Integer> params;

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class VisibilityTypeParams {
		private Set<Integer> params;

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	public class DaypartTargetParams {

		private List<DaypartTargetDayAndHours> params;

		public void setParams(List<DaypartTargetDayAndHours> params) {
			this.params = params;
		}

		public List<DaypartTargetDayAndHours> getParams() {
			return this.params;
		}

	}

	public class InventoryListParams {

		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}

	/*public class ZipCodeFileParams {

		private String action;
		private Set<Integer> params;

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Set<Integer> getParams() {
			return params;
		}

		public void setParams(Set<Integer> params) {
			this.params = params;
		}

	}
*/
	public class DaypartTargetDayAndHours {
		private String day;
		private int start_hour;
		private int end_hour;

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public int getStart_hour() {
			return start_hour;
		}

		public void setStart_hour(int start_hour) {
			this.start_hour = start_hour;
		}

		public int getEnd_hour() {
			return end_hour;
		}

		public void setEnd_hour(int end_hour) {
			this.end_hour = end_hour;
		}

	}

}