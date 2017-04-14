/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.changedetection.state;

import java.util.List;

/**
 * An immutable snapshot of the content and meta-data of some part of the file system. The file may be a regular file, directory or missing.
 */
public interface FileTreeSnapshot {
    /**
     * The absolute path of this file. Can safely be used as a cache key.
     */
    String getPath();

    /**
     * The descendents of this file, if any. Includes direct and indirect children. Does not include the root file.
     */
    List<FileSnapshot> getDescendents();
}
