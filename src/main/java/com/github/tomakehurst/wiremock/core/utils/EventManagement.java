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

import com.github.tomakehurst.wiremock.admin.model.GetServeEventsResult;
import com.github.tomakehurst.wiremock.admin.model.ServeEventQuery;
import com.github.tomakehurst.wiremock.admin.model.SingleServedStubResult;
import com.github.tomakehurst.wiremock.matching.RequestPattern;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.verification.*;
import java.util.UUID;

public interface EventManagement {
  GetServeEventsResult getServeEvents();

  GetServeEventsResult getServeEvents(ServeEventQuery query);

  SingleServedStubResult getServedStub(UUID id);

  VerificationResult countRequestsMatching(RequestPattern requestPattern);

  FindRequestsResult findRequestsMatching(RequestPattern requestPattern);

  FindRequestsResult findUnmatchedRequests();

  void removeServeEvent(UUID eventId);

  FindServeEventsResult removeServeEventsMatching(RequestPattern requestPattern);

  FindServeEventsResult removeServeEventsForStubsMatchingMetadata(StringValuePattern pattern);

  FindNearMissesResult findTopNearMissesFor(LoggedRequest loggedRequest);

  FindNearMissesResult findTopNearMissesFor(RequestPattern requestPattern);

  FindNearMissesResult findNearMissesForUnmatchedRequests();
}
