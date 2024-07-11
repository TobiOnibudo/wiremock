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
package com.github.tomakehurst.wiremock.core.utils;

import com.github.tomakehurst.wiremock.admin.model.ListStubMappingsResult;
import com.github.tomakehurst.wiremock.admin.model.SingleStubMappingResult;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.stubbing.StubImport;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import java.util.UUID;

public interface StubManagement {
  void addStubMapping(StubMapping stubMapping);

  void editStubMapping(StubMapping stubMapping);

  void removeStubMapping(StubMapping stubbMapping);

  void removeStubMapping(UUID id);

  ListStubMappingsResult listAllStubMappings();

  SingleStubMappingResult getStubMapping(UUID id);

  void saveMappings();

  void resetRequests();

  void resetScenarios();

  void resetMappings();

  void resetAll();

  void resetToDefaultMappings();

  void removeStubsByMetadata(StringValuePattern pattern);

  void importStubs(StubImport stubImport);
}
