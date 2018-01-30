/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataportabilityproject.serviceProviders.fiveHundredPx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class FHPxPhoto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")  // AKA title
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("images")
    private List<FHPxImage> imageList;

    // NB: image_url is deprecated, and image_type isn't documented

    public int getId() { return id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public List<FHPxImage> getImageList() { return imageList; }
}