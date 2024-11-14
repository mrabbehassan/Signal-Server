/*
 * Copyright 2024 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */
package org.whispersystems.textsecuregcm.storage.devicecheck;

public class RequestReuseException extends Exception {

  public RequestReuseException(String s) {
    super(s);
  }
}
