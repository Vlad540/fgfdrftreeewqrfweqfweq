package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

public class SimpleItemsApiValue extends oq0 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    public void write(t67 t67) throws IOException, JsonSerializeException {
        t67.u();
        for (CallAnalyticsEvent serialize : this.items) {
            EventSerializer.INSTANCE.serialize(t67, serialize);
        }
        t67.t();
    }
}
