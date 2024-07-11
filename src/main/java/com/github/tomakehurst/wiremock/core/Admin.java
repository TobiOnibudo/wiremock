/*
 * Copyright (C) 2011-2024 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.core;

import com.github.tomakehurst.wiremock.admin.model.GetGlobalSettingsResult;
import com.github.tomakehurst.wiremock.admin.model.GetScenariosResult;
import com.github.tomakehurst.wiremock.admin.model.ListStubMappingsResult;
import com.github.tomakehurst.wiremock.core.utils.EventManagement;
import com.github.tomakehurst.wiremock.core.utils.StubManagement;
import com.github.tomakehurst.wiremock.global.GlobalSettings;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.recording.RecordSpec;
import com.github.tomakehurst.wiremock.recording.RecordSpecBuilder;
import com.github.tomakehurst.wiremock.recording.RecordingStatusResult;
import com.github.tomakehurst.wiremock.recording.SnapshotRecordResult;

public interface Admin extends StubManagement, EventManagement {

  GetScenariosResult getAllScenarios();

  void resetScenario(String name);

  void setScenarioState(String name, String state);

  void updateGlobalSettings(GlobalSettings settings);

  SnapshotRecordResult snapshotRecord();

  SnapshotRecordResult snapshotRecord(RecordSpec spec);

  SnapshotRecordResult snapshotRecord(RecordSpecBuilder spec);

  void startRecording(String targetBaseUrl);

  void startRecording(RecordSpec spec);

  void startRecording(RecordSpecBuilder recordSpec);

  SnapshotRecordResult stopRecording();

  RecordingStatusResult getRecordingStatus();

  Options getOptions();

  void shutdownServer();

  ListStubMappingsResult findAllStubsByMetadata(StringValuePattern pattern);

  GetGlobalSettingsResult getGlobalSettings();
}
