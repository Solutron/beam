/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.beam.runners.dataflow.util;

import com.google.api.client.util.NanoClock;
import com.google.api.client.util.Sleeper;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;
import org.apache.beam.runners.dataflow.DataflowPipelineJob;
import org.apache.beam.sdk.PipelineResult.State;
import org.joda.time.Duration;

/**
 * A {@link DataflowPipelineJob} that is returned when {@code --templateRunner} is set.
 */
public class DataflowTemplateJob extends DataflowPipelineJob {
  private static final String ERROR =
      "The result of template creation should not be used.";

  public DataflowTemplateJob() {
    super(null, null, null);
  }

  @Override
  public String getJobId() {
    throw new UnsupportedOperationException(ERROR);
  }

  @Override
  public String getProjectId() {
    throw new UnsupportedOperationException(ERROR);
  }

  @Override
  public DataflowPipelineJob getReplacedByJob() {
    throw new UnsupportedOperationException(ERROR);
  }

  @Nullable
  @VisibleForTesting
  State waitUntilFinish(
      Duration duration,
      MonitoringUtil.JobMessagesHandler messageHandler,
      Sleeper sleeper,
      NanoClock nanoClock) {
    throw new UnsupportedOperationException(ERROR);
  }

  @Override
  public State cancel() {
    throw new UnsupportedOperationException(ERROR);
  }

  @Override
  public State getState() {
    throw new UnsupportedOperationException(ERROR);
  }
}
