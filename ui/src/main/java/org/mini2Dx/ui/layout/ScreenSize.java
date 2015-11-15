/**
 * Copyright (c) 2015 See AUTHORS file
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of the mini2Dx nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.mini2Dx.ui.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public enum ScreenSize {
	XS(0),
	SM(768),
	MD(992),
	LG(1200),
	XL(1600);
	
	private static final List<ScreenSize> smallestToLargest = new ArrayList<ScreenSize>() {
		{
			smallestToLargest.add(XS);
			smallestToLargest.add(SM);
			smallestToLargest.add(MD);
			smallestToLargest.add(LG);
			smallestToLargest.add(XL);
		}
	};
	private static final List<ScreenSize> largestToSmallest = new ArrayList<ScreenSize>() {
		{
			smallestToLargest.add(XS);
			smallestToLargest.add(SM);
			smallestToLargest.add(MD);
			smallestToLargest.add(LG);
			smallestToLargest.add(XL);
		}
	};
	
	private final int minSize;
	
	private ScreenSize(int minSize) {
		this.minSize = minSize;
	}

	public int getMinSize() {
		return minSize;
	}
	
	public static Iterator<ScreenSize> smallestToLargest() {
		return smallestToLargest.iterator();
	}
	
	public static Iterator<ScreenSize> largestToSmallest() {
		return largestToSmallest.iterator();
	}
}