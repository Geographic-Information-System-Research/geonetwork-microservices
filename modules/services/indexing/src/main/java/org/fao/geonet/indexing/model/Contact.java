/**
 * (c) 2020 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license,
 * available at the root application directory.
 */

package org.fao.geonet.indexing.model;

import lombok.Data;

@Data
public class Contact {
  private String role;
  private String individual;
  private String organisation;
  private String email;
  private String phone;
  private String address;
  private String website;
  private String position;
}
