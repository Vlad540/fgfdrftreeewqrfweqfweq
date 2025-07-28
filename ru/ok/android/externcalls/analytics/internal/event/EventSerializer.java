package ru.ok.android.externcalls.analytics.internal.event;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/event/EventSerializer;", "", "<init>", "()V", "Lt67;", "writer", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "Ljue;", "writeValue", "(Lt67;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "serialize", "(Lt67;Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class EventSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
    }

    private final void writeValue(t67 t67, EventItemValue eventItemValue) {
        if (eventItemValue instanceof EventItemValue.FloatValue) {
            Float valueOf = Float.valueOf(((EventItemValue.FloatValue) eventItemValue).m39unboximpl());
            t1 t1Var = (t1) t67;
            t1Var.getClass();
            t1Var.d(valueOf.doubleValue());
        } else if (eventItemValue instanceof EventItemValue.IntValue) {
            int r2 = ((EventItemValue.IntValue) eventItemValue).m46unboximpl();
            t1 t1Var2 = (t1) t67;
            t1Var2.getClass();
            t1Var2.a(Integer.toString(r2));
        } else if (eventItemValue instanceof EventItemValue.LongValue) {
            long r0 = ((EventItemValue.LongValue) eventItemValue).m53unboximpl();
            t1 t1Var3 = (t1) t67;
            t1Var3.getClass();
            t1Var3.a(Long.toString(r0));
        } else if (eventItemValue instanceof EventItemValue.StringValue) {
            t67.i(((EventItemValue.StringValue) eventItemValue).m60unboximpl());
        }
    }

    public final void serialize(t67 t67, CallAnalyticsEvent callAnalyticsEvent) {
        t67.s();
        for (Map.Entry next : callAnalyticsEvent.getItems().entrySet()) {
            t67.g0((String) next.getKey());
            writeValue(t67, (EventItemValue) next.getValue());
        }
        t67.q();
    }
}
