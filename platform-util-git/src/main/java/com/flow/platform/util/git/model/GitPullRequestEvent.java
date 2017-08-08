/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.util.git.model;

/**
 * @author yang
 */
public class GitPullRequestEvent extends GitEvent {

    private String title;

    private Integer requestId;

    private GitPullRequestInfo source;

    private GitPullRequestInfo target;

    private String action;

    private String description;

    private String status;

    private String mergeStatus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public GitPullRequestInfo getSource() {
        return source;
    }

    public void setSource(GitPullRequestInfo source) {
        this.source = source;
    }

    public GitPullRequestInfo getTarget() {
        return target;
    }

    public void setTarget(GitPullRequestInfo target) {
        this.target = target;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }
}
