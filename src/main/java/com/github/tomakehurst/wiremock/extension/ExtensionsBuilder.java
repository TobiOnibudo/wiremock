/*
 * Copyright (C) 2024 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.extension;

import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.core.Admin;
import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.store.Stores;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExtensionsBuilder {
  private ExtensionDeclarations extensionDeclarations = new ExtensionDeclarations();
  private Admin admin;
  private Options options;
  private Stores stores;
  private FileSource files;
  private Map<String, Extension> loadedExtensions = new LinkedHashMap<>();

  public ExtensionsBuilder withExtensionDeclarations(ExtensionDeclarations extensionDeclarations) {
    this.extensionDeclarations = extensionDeclarations;
    return this;
  }

  public ExtensionsBuilder withAdmin(Admin admin) {
    this.admin = admin;
    return this;
  }

  public ExtensionsBuilder withOptions(Options options) {
    this.options = options;
    return this;
  }

  public ExtensionsBuilder withStores(Stores stores) {
    this.stores = stores;
    return this;
  }

  public ExtensionsBuilder withFiles(FileSource files) {
    this.files = files;
    return this;
  }

  public ExtensionsBuilder withLoadedExtensions(Map<String, Extension> loadedExtensions) {
    this.loadedExtensions = loadedExtensions;
    return this;
  }

  public Extensions build() {
    return new Extensions(this);
  }

  public ExtensionDeclarations getExtensionDeclarations() {
    return extensionDeclarations;
  }

  public Admin getAdmin() {
    return admin;
  }

  public Options getOptions() {
    return options;
  }

  public Stores getStores() {
    return stores;
  }

  public FileSource getFiles() {
    return files;
  }

  public Map<String, Extension> getLoadedExtensions() {
    return loadedExtensions;
  }
}
