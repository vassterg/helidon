/*
 * Copyright (c) 2020, 2021 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Utilities for Jersey handling.
 */
module io.helidon.jersey.common {
    requires java.logging;
    requires jakarta.annotation;

    requires io.helidon.common;

    requires jakarta.ws.rs;
    requires jersey.common;
    requires jersey.server;

    exports io.helidon.jersey.common;
}
