package com.oilrig.models.Targeting;

import java.util.List;

public class CreateTargetingResponse {
	private DataParams data;

	public void setData(DataParams data) {
		this.data = data;
	}

	public DataParams getData() {
		return this.data;
	}

	public class DataParams {
		private ProfileParams profile;

		public void setProfile(ProfileParams profile) {
			this.profile = profile;
		}

		public ProfileParams getProfile() {
			return this.profile;
		}
	}

	public class ProfileParams {
		private int id;
		private int line_item_id;
		private String country_action;
		private String dma_action;
		private String region_action;
		private String city_action;
		private String language_action;
		private String device_type_action;
		private String os_action;
		private String browser_action;
		private String inventory_list_action;
		private String segment_action;
		private String seller_network_action;
		private String xandr_profile_id;
		private boolean xandr_update_status;
		private String user_id;
		private String createdAt;
		private String updatedAt;
		private List<ProfileCitiesParams> profile_cities;
		private List<ProfileCountriesParams> profile_countries;
		private List<ProfileRegionsParams> profile_regions;
		private List<ProfileDMAParams> profile_dmas;
		private List<ProfileLanguagesParams> profile_languages;
		private List<ProfileBrowsersParams> profile_browsers;
		private List<ProfileOSTypesParams> profile_os_types;
		private List<ProfileDeviceTypesParams> profile_device_types;
		private List<ProfilePlayerSizesParams> profile_player_sizes;
		private List<ProfileVisibilityTypesParams> profile_visibility_types;
		private List<DaypartTargetsParams> daypart_targets;
		private List<ProfileSegmentsParams> profile_segments;
		private List<ProfileSellerNetworksParams> profile_seller_networks;
		private List<ProfileInventoryListsParams> profile_inventory_lists;
		private List<String> profile_zip_code_files;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setLine_item_id(int line_item_id) {
			this.line_item_id = line_item_id;
		}

		public int getLine_item_id() {
			return this.line_item_id;
		}

		public void setCountry_action(String country_action) {
			this.country_action = country_action;
		}

		public String getCountry_action() {
			return this.country_action;
		}

		public void setDma_action(String dma_action) {
			this.dma_action = dma_action;
		}

		public String getDma_action() {
			return this.dma_action;
		}

		public void setRegion_action(String region_action) {
			this.region_action = region_action;
		}

		public String getRegion_action() {
			return this.region_action;
		}

		public void setCity_action(String city_action) {
			this.city_action = city_action;
		}

		public String getCity_action() {
			return this.city_action;
		}

		public void setLanguage_action(String language_action) {
			this.language_action = language_action;
		}

		public String getLanguage_action() {
			return this.language_action;
		}

		public void setDevice_type_action(String device_type_action) {
			this.device_type_action = device_type_action;
		}

		public String getDevice_type_action() {
			return this.device_type_action;
		}

		public void setOs_action(String os_action) {
			this.os_action = os_action;
		}

		public String getOs_action() {
			return this.os_action;
		}

		public void setBrowser_action(String browser_action) {
			this.browser_action = browser_action;
		}

		public String getBrowser_action() {
			return this.browser_action;
		}

		public void setInventory_list_action(String inventory_list_action) {
			this.inventory_list_action = inventory_list_action;
		}

		public String getInventory_list_action() {
			return this.inventory_list_action;
		}

		public void setSegment_action(String segment_action) {
			this.segment_action = segment_action;
		}

		public String getSegment_action() {
			return this.segment_action;
		}

		public void setSeller_network_action(String seller_network_action) {
			this.seller_network_action = seller_network_action;
		}

		public String getSeller_network_action() {
			return this.seller_network_action;
		}

		public void setXandr_profile_id(String xandr_profile_id) {
			this.xandr_profile_id = xandr_profile_id;
		}

		public String getXandr_profile_id() {
			return this.xandr_profile_id;
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

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setProfile_cities(List<ProfileCitiesParams> profile_cities) {
			this.profile_cities = profile_cities;
		}

		public List<ProfileCitiesParams> getProfile_cities() {
			return this.profile_cities;
		}

		public void setProfile_countries(List<ProfileCountriesParams> profile_countries) {
			this.profile_countries = profile_countries;
		}

		public List<ProfileCountriesParams> getProfile_countries() {
			return this.profile_countries;
		}

		public void setProfile_regions(List<ProfileRegionsParams> profile_regions) {
			this.profile_regions = profile_regions;
		}

		public List<ProfileRegionsParams> getProfile_regions() {
			return this.profile_regions;
		}

		public void setProfile_dmas(List<ProfileDMAParams> profile_dmas) {
			this.profile_dmas = profile_dmas;
		}

		public List<ProfileDMAParams> getProfile_dmas() {
			return this.profile_dmas;
		}

		public void setProfile_languages(List<ProfileLanguagesParams> profile_languages) {
			this.profile_languages = profile_languages;
		}

		public List<ProfileLanguagesParams> getProfile_languages() {
			return this.profile_languages;
		}

		public void setProfile_browsers(List<ProfileBrowsersParams> profile_browsers) {
			this.profile_browsers = profile_browsers;
		}

		public List<ProfileBrowsersParams> getProfile_browsers() {
			return this.profile_browsers;
		}

		public void setProfile_os_types(List<ProfileOSTypesParams> profile_os_types) {
			this.profile_os_types = profile_os_types;
		}

		public List<ProfileOSTypesParams> getProfile_os_types() {
			return this.profile_os_types;
		}

		public void setProfile_device_types(List<ProfileDeviceTypesParams> profile_device_types) {
			this.profile_device_types = profile_device_types;
		}

		public List<ProfileDeviceTypesParams> getProfile_device_types() {
			return this.profile_device_types;
		}

		public void setProfile_player_sizes(List<ProfilePlayerSizesParams> profile_player_sizes) {
			this.profile_player_sizes = profile_player_sizes;
		}

		public List<ProfilePlayerSizesParams> getProfile_player_sizes() {
			return this.profile_player_sizes;
		}

		public void setProfile_visibility_types(List<ProfileVisibilityTypesParams> profile_visibility_types) {
			this.profile_visibility_types = profile_visibility_types;
		}

		public List<ProfileVisibilityTypesParams> getProfile_visibility_types() {
			return this.profile_visibility_types;
		}

		public void setDaypart_targets(List<DaypartTargetsParams> daypart_targets) {
			this.daypart_targets = daypart_targets;
		}

		public List<DaypartTargetsParams> getDaypart_targets() {
			return this.daypart_targets;
		}

		public void setProfile_segments(List<ProfileSegmentsParams> profile_segments) {
			this.profile_segments = profile_segments;
		}

		public List<ProfileSegmentsParams> getProfile_segments() {
			return this.profile_segments;
		}

		public void setProfile_seller_networks(List<ProfileSellerNetworksParams> profile_seller_networks) {
			this.profile_seller_networks = profile_seller_networks;
		}

		public List<ProfileSellerNetworksParams> getProfile_seller_networks() {
			return this.profile_seller_networks;
		}

		public void setProfile_inventory_lists(List<ProfileInventoryListsParams> profile_inventory_lists) {
			this.profile_inventory_lists = profile_inventory_lists;
		}

		public List<ProfileInventoryListsParams> getProfile_inventory_lists() {
			return this.profile_inventory_lists;
		}

		public void setProfile_zip_code_files(List<String> profile_zip_code_files) {
			this.profile_zip_code_files = profile_zip_code_files;
		}

		public List<String> getProfile_zip_code_files() {
			return this.profile_zip_code_files;
		}
	}

	public class City {
		private int id;

		private String region_code;

		private String country_code;

		private String name;

		private String createdAt;

		private String updatedAt;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setRegion_code(String region_code) {
			this.region_code = region_code;
		}

		public String getRegion_code() {
			return this.region_code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

		public String getCountry_code() {
			return this.country_code;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileCitiesParams {
		private int city_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private City city;

		public void setCity_id(int city_id) {
			this.city_id = city_id;
		}

		public int getCity_id() {
			return this.city_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public City getCity() {
			return this.city;
		}
	}

	public class Country {
		private String code;

		private String name;

		private String createdAt;

		private String updatedAt;

		public void setCode(String code) {
			this.code = code;
		}

		public String getCode() {
			return this.code;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileCountriesParams {
		private String country_code;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Country country;

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

		public String getCountry_code() {
			return this.country_code;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public Country getCountry() {
			return this.country;
		}
	}

	public class ProfileRegionsParams {
		private String region_code;

		private String country_code;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private String region;

		public void setRegion_code(String region_code) {
			this.region_code = region_code;
		}

		public String getRegion_code() {
			return this.region_code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

		public String getCountry_code() {
			return this.country_code;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegion() {
			return this.region;
		}
	}

	public class Dma {
		private int code;

		private String country_code;

		private String name;

		private String createdAt;

		private String updatedAt;

		public void setCode(int code) {
			this.code = code;
		}

		public int getCode() {
			return this.code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

		public String getCountry_code() {
			return this.country_code;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileDMAParams {
		private int dma_code;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Dma dma;

		public void setDma_code(int dma_code) {
			this.dma_code = dma_code;
		}

		public int getDma_code() {
			return this.dma_code;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setDma(Dma dma) {
			this.dma = dma;
		}

		public Dma getDma() {
			return this.dma;
		}
	}

	public class Language {
		private String code;

		private String name;

		private String createdAt;

		private String updatedAt;

		public void setCode(String code) {
			this.code = code;
		}

		public String getCode() {
			return this.code;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileLanguagesParams {
		private String language_code;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Language language;

		public void setLanguage_code(String language_code) {
			this.language_code = language_code;
		}

		public String getLanguage_code() {
			return this.language_code;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}

		public Language getLanguage() {
			return this.language;
		}
	}

	public class Browser {
		private int id;

		private String name;

		private String createdAt;

		private String updatedAt;

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

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileBrowsersParams {
		private int browser_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Browser browser;

		public void setBrowser_id(int browser_id) {
			this.browser_id = browser_id;
		}

		public int getBrowser_id() {
			return this.browser_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setBrowser(Browser browser) {
			this.browser = browser;
		}

		public Browser getBrowser() {
			return this.browser;
		}
	}

	public class Os_type {
		private int id;

		private String name;

		private String createdAt;

		private String updatedAt;

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

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileOSTypesParams {
		private int os_type_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Os_type os_type;

		public void setOs_type_id(int os_type_id) {
			this.os_type_id = os_type_id;
		}

		public int getOs_type_id() {
			return this.os_type_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setOs_type(Os_type os_type) {
			this.os_type = os_type;
		}

		public Os_type getOs_type() {
			return this.os_type;
		}
	}

	public class Device_type {
		private int id;

		private String name;

		private String createdAt;

		private String updatedAt;

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

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileDeviceTypesParams {
		private int device_type_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Device_type device_type;

		public void setDevice_type_id(int device_type_id) {
			this.device_type_id = device_type_id;
		}

		public int getDevice_type_id() {
			return this.device_type_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setDevice_type(Device_type device_type) {
			this.device_type = device_type;
		}

		public Device_type getDevice_type() {
			return this.device_type;
		}
	}

	public class Player_size {
		private int id;

		private String name;

		private int min_width;

		private int max_width;

		private String createdAt;

		private String updatedAt;

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

		public void setMin_width(int min_width) {
			this.min_width = min_width;
		}

		public int getMin_width() {
			return this.min_width;
		}

		public void setMax_width(int max_width) {
			this.max_width = max_width;
		}

		public int getMax_width() {
			return this.max_width;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfilePlayerSizesParams {
		private int player_size_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Player_size player_size;

		public void setPlayer_size_id(int player_size_id) {
			this.player_size_id = player_size_id;
		}

		public int getPlayer_size_id() {
			return this.player_size_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setPlayer_size(Player_size player_size) {
			this.player_size = player_size;
		}

		public Player_size getPlayer_size() {
			return this.player_size;
		}
	}

	public class Visibility_type {
		private int id;

		private String position;

		private String createdAt;

		private String updatedAt;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getPosition() {
			return this.position;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileVisibilityTypesParams {
		private int visibility_type_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Visibility_type visibility_type;

		public void setVisibility_type_id(int visibility_type_id) {
			this.visibility_type_id = visibility_type_id;
		}

		public int getVisibility_type_id() {
			return this.visibility_type_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setVisibility_type(Visibility_type visibility_type) {
			this.visibility_type = visibility_type;
		}

		public Visibility_type getVisibility_type() {
			return this.visibility_type;
		}
	}

	public class DaypartTargetsParams {
		private int id;

		private int profile_id;

		private String day;

		private int start_hour;

		private int end_hour;

		private String createdAt;

		private String updatedAt;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getDay() {
			return this.day;
		}

		public void setStart_hour(int start_hour) {
			this.start_hour = start_hour;
		}

		public int getStart_hour() {
			return this.start_hour;
		}

		public void setEnd_hour(int end_hour) {
			this.end_hour = end_hour;
		}

		public int getEnd_hour() {
			return this.end_hour;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class Segment {
		private int id;

		private String name;

		private String state;

		private String data_provider;

		private int xandr_segment_id;

		private int xandr_member_id;

		private String createdAt;

		private String updatedAt;

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

		public void setData_provider(String data_provider) {
			this.data_provider = data_provider;
		}

		public String getData_provider() {
			return this.data_provider;
		}

		public void setXandr_segment_id(int xandr_segment_id) {
			this.xandr_segment_id = xandr_segment_id;
		}

		public int getXandr_segment_id() {
			return this.xandr_segment_id;
		}

		public void setXandr_member_id(int xandr_member_id) {
			this.xandr_member_id = xandr_member_id;
		}

		public int getXandr_member_id() {
			return this.xandr_member_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileSegmentsParams {
		private int segment_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Segment segment;

		public void setSegment_id(int segment_id) {
			this.segment_id = segment_id;
		}

		public int getSegment_id() {
			return this.segment_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setSegment(Segment segment) {
			this.segment = segment;
		}

		public Segment getSegment() {
			return this.segment;
		}
	}

	public class Seller_network {
		private int id;

		private String name;

		private int xandr_seller_network_id;

		private String createdAt;

		private String updatedAt;

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

		public void setXandr_seller_network_id(int xandr_seller_network_id) {
			this.xandr_seller_network_id = xandr_seller_network_id;
		}

		public int getXandr_seller_network_id() {
			return this.xandr_seller_network_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileSellerNetworksParams {
		private int seller_network_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Seller_network seller_network;

		public void setSeller_network_id(int seller_network_id) {
			this.seller_network_id = seller_network_id;
		}

		public int getSeller_network_id() {
			return this.seller_network_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setSeller_network(Seller_network seller_network) {
			this.seller_network = seller_network;
		}

		public Seller_network getSeller_network() {
			return this.seller_network;
		}
	}

	public class Inventory_list {
		private int id;

		private String file_name;

		private String s3_url;

		private String xandr_inventory_list_id;

		private boolean xandr_update_status;

		private String createdAt;

		private String updatedAt;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setFile_name(String file_name) {
			this.file_name = file_name;
		}

		public String getFile_name() {
			return this.file_name;
		}

		public void setS3_url(String s3_url) {
			this.s3_url = s3_url;
		}

		public String getS3_url() {
			return this.s3_url;
		}

		public void setXandr_inventory_list_id(String xandr_inventory_list_id) {
			this.xandr_inventory_list_id = xandr_inventory_list_id;
		}

		public String getXandr_inventory_list_id() {
			return this.xandr_inventory_list_id;
		}

		public void setXandr_update_status(boolean xandr_update_status) {
			this.xandr_update_status = xandr_update_status;
		}

		public boolean getXandr_update_status() {
			return this.xandr_update_status;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}
	}

	public class ProfileInventoryListsParams {
		private int inventory_list_id;

		private int profile_id;

		private String createdAt;

		private String updatedAt;

		private Inventory_list inventory_list;

		public void setInventory_list_id(int inventory_list_id) {
			this.inventory_list_id = inventory_list_id;
		}

		public int getInventory_list_id() {
			return this.inventory_list_id;
		}

		public void setProfile_id(int profile_id) {
			this.profile_id = profile_id;
		}

		public int getProfile_id() {
			return this.profile_id;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setInventory_list(Inventory_list inventory_list) {
			this.inventory_list = inventory_list;
		}

		public Inventory_list getInventory_list() {
			return this.inventory_list;
		}
	}
}