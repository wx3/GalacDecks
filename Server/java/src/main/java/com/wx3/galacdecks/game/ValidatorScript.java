/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 Kevin Lin
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 */
/**
 * 
 */
package com.wx3.galacdecks.game;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PlayValidators are small scripts used by the {@link PlayValidator} to
 * determine if a particular action is valid.
 * 
 * @author Kevin
 *
 */
@Entity
@Table(name="validators")
public class ValidatorScript {

	@Id
	private String id;
	private String description;
	private String script;
	
	public static ValidatorScript createValidator(String id, String script, String description) {
		ValidatorScript validator = new ValidatorScript();
		validator.id = id;
		validator.script = script;
		validator.description = description;
		return validator;
	}
	
	public String getId() {
		return id;
	}
	
	public String getScript() {
		return script;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return id + '@' + Integer.toHexString(hashCode());
	}
}