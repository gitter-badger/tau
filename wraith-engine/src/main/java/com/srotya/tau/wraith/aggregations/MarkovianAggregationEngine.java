/**
 * Copyright 2016 Symantec Corporation.
 * 
 * Licensed under the Apache License, Version 2.0 (the “License”); 
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
package com.srotya.tau.wraith.aggregations;

import java.io.IOException;
import java.util.List;

import com.srotya.tau.wraith.Event;

/**
 * Markovian Aggregation Engine. An aggregation engine that adheres to the
 * 
 * Markov rule i.e. only end state matters vs quantized.<br><br>
 * 
 * Aggregates are only temporarily stored in the system.<br><br>
 * 
 * @author ambud_sharma
 */
public interface MarkovianAggregationEngine extends AggregationEngine {

	/**
	 * 
	 * 
	 * @param aggregationWindow
	 * @param ruleActionId
	 * @param emits output the emits here
	 * @throws IOException
	 */
	public void emit(int aggregationWindow, String ruleActionId, List<Event> emits) throws IOException;

}
