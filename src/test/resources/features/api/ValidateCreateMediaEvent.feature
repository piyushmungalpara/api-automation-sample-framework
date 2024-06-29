Feature: Verify Create Campaign

  @loadTestData
  Scenario: Validate that user should be able to login
    Given user has valid login credential as 'Test' user to fetch Token
    When user post a POST request to authorize API
    Then validate that response of authorize API should have status code as 200

  Scenario: Validate that user should be able to create campaign
    Given user set parameter to create an advetiser with name as and state as
      | name  | state       |
      | true: | true:active |
    When user post a POST request to create an advetiser
    Then validate that response of create advertiser API should have status code as 200
    Given user set parameter to create campaign with following details
      | name  | budget_type     | budget_type_value | start_date | end_date | advertiser | viewability_standard_provider |
      | true: | true:impression | true:50000        | true:0     | true:10  | true:      | true:iab                      |
    When user post a POST request to create campaign
    Then validate that response of create campaign API should have status code as 200
    Given user set parameter to create line item with following details
      | name  | cpm    | margin  | ad_type    |
      | true: | true:5 | true:10 | true:video |

    When user post a POST request to create line item
    Then validate that response of create line item API should have status code as 200
    Given user set parameter to create targeting with city as follows
      | city  | country | region | dma   | language | device_type | os_type | browser | segment | seller_network | player_size | visibility_type | daypart_target | inventory_list | zip_code_file |
      | true: | true:   | true:  | true: | true:    | true:       | true:   | true:   | true:   | true:          | true:       | true:           | true:          | true:          | false:        |
      #already commented
        #Given user set parameter to create targeting with city as "false:", country as "true:", region as "false:", dma as "false:", language as "false:", device_type as "false:", os_type as"false:", browser as "false:", segment as "false:", seller_network as "false:", player_size as "false:", visibility_type as"false:", daypart_target as "false:", inventory_list as "false:" and zip_code_file as "false:"
    When user post a POST request to create targeting
    Then validate that response of create targeting API should have status code as 200
    Given user set parameter to create ad unit with following details
      | name  | budget_interval_start_day | budget_interval_end_day | budget_value |
      | true: | true:0                    | true:4                  | true:10000   |
    When user post a POST request to create ad unit
    Then validate that response of create ad unit API should have status code as 200

    Given user set parameter to create Creative with following details
      | name  | advertiser_id | ad_type | is_third_party_tag | ad_tag_type | is_non_linear |
      | true: | true:         | true:   | true:true          | true:vpaid  | true:true     |
    When user post a POST request to create Creative
    Then validate that response of create Creative API should have status code as 200
    Given user set parameter to create Creative Media with
      | media_url | file_type | width | height | duration |
      | true:     | true:     | true: | true:  | true:    |
    When user post a POST request to create Creative Media
    Then validate that response of create Creative Media API should have status code as 200

    Given user set parameter to create Creative Events with
      | event_type          |
      | true:MIDPOINT       |
      | true:CREATIVEVIEW   |
      | false:firstQuartile |
      | true:Start          |
    When user post a POST request to create Creative Event
    Then validate that response of create Creative Event API should have status code as 200
    Given user set parameter to create AdTag
    When user post a PUT request to create AdTag
    Then validate that response of create AdTag API should have status code as 200
    When user post a POST request to publish the Campaign
    Then validate that response of publish campaign API should have status code as 200
    When user fetch all campaigns details
    Then validate that campaign is created with proper values and state as "active"



