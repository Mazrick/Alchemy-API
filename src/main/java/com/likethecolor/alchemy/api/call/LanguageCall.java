/**
 * File: LanguageCall.java
 * Original Author: Dan Brown <dan@likethecolor.com>
 * Copyright 2012 Dan Brown <dan@likethecolor.com>
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
package com.likethecolor.alchemy.api.call;

import com.likethecolor.alchemy.api.Constants;
import com.likethecolor.alchemy.api.call.type.CallType;
import com.likethecolor.alchemy.api.entity.LanguageAlchemyEntity;
import com.likethecolor.alchemy.api.entity.Response;
import com.likethecolor.alchemy.api.params.LanguageParams;
import com.likethecolor.alchemy.api.params.Params;
import com.likethecolor.alchemy.api.parser.json.LanguageParser;

public class LanguageCall extends AbstractCall<LanguageAlchemyEntity> {
  public LanguageCall(final CallType callType) {
    this(callType, new LanguageParams());
  }

  public LanguageCall(final CallType callType, final Params params) {
    super(callType, params);
  }

  @Override
  public String getName() {
    return Constants.CALL_NAME_LANGUAGE;
  }

  @Override
  public Response<LanguageAlchemyEntity> parse(String jsonString) {
    return new LanguageParser().parse(jsonString);
  }
}
