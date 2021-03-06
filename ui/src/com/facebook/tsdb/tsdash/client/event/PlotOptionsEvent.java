/*
 * Copyright 2011 Facebook, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.tsdb.tsdash.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class PlotOptionsEvent extends GwtEvent<PlotOptionsEventHandler> {

    public static final GwtEvent.Type<PlotOptionsEventHandler> TYPE =
            new GwtEvent.Type<PlotOptionsEventHandler>();

    private boolean interactive;
    private boolean surface;
    private boolean palette;
    
    public PlotOptionsEvent(boolean interactive, boolean surface,
            boolean palette) {
        this.interactive = interactive;
        this.surface = surface;
        this.palette = palette;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public boolean surfaceEnabled() {
        return surface;
    }
    
    public boolean colorPaletteEnabled() {
        return palette;
    }
    
    @Override
    public GwtEvent.Type<PlotOptionsEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(PlotOptionsEventHandler handler) {
        handler.onPlotOptionsChange(this);
    }
}
