/**
 * Copyright (c) 2016 Couchbase, Inc. All rights reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.couchbase.lite.mockserver;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * A smarter MockResponse to allow for dynamic changes at the time
 * that a request is being processed.  Eg, it updates its response
 * body based on the request.
 */
public interface SmartMockResponse {

    MockResponse generateMockResponse(RecordedRequest request);

    boolean isSticky();

    /**
     * @return the delay, in milliseconds, before the MockDispatcher should
     * return this response.
     */
    long delayMs();
}
