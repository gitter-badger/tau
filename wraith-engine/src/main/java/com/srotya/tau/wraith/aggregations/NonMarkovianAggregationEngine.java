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

/**
 * Non-markovian engine, means evolution of time series matters not just the current value
 * 
 * This type of engine stores the time series in a persistent datastore to be used in future.
 * 
 * @author ambud_sharma
 */
public interface NonMarkovianAggregationEngine extends AggregationEngine {

	/**
	 * Commit the results to the external store
	 * 
	 * @param aggregationWindow
	 * @param ruleActionId
	 * @throws IOException
	 */
	public void commit(int aggregationWindow, String ruleActionId) throws IOException;
	
}
