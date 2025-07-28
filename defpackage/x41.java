package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* renamed from: x41  reason: default package */
public final class x41 implements w41 {
    public static final List e = Collections.singletonList("rtt");
    public final CallAnalyticsSender a;
    public final eje b;
    public EventItemsMap c;
    public final ArrayList d = new ArrayList();

    public x41(CallAnalyticsSender callAnalyticsSender, fje fje) {
        this.a = callAnalyticsSender;
        this.b = fje;
    }

    public final void b(swf swf, EventItemsMap eventItemsMap) {
        long j;
        EventItemsMap eventItemsMap2 = swf.c;
        eventItemsMap2.addAll(eventItemsMap);
        Long l = swf.d;
        if (l == null) {
            eje eje = this.b;
            Long a2 = ((fje) eje).a();
            if (a2 != null) {
                l = a2;
            } else {
                ((fje) eje).getClass();
                j = System.currentTimeMillis();
                this.a.send(new SdkMetricStatEvent.Builder(swf.a, swf.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
            }
        }
        j = l.longValue();
        this.a.send(new SdkMetricStatEvent.Builder(swf.a, swf.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
    }

    public final void c(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        swf swf = new swf(str, eventItemValue, eventItemsMap, ((fje) this.b).a());
        EventItemsMap eventItemsMap2 = this.c;
        if (eventItemsMap2 == null) {
            this.d.add(swf);
        } else {
            b(swf, eventItemsMap2);
        }
    }
}
