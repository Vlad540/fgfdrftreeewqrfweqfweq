package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: jmc  reason: default package */
public final class jmc extends l5e implements i26 {
    public final /* synthetic */ tkc X;
    public final /* synthetic */ ScheduledSendPickerViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jmc(tkc tkc, ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = tkc;
        this.Y = scheduledSendPickerViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jmc(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        vlc vlc;
        int i;
        wx3.H(obj);
        tkc tkc = this.X;
        LinkedHashMap linkedHashMap = tkc.a;
        try {
            obj2 = linkedHashMap.get("ScheduledSendPickerViewModel:delayed_attrs");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("ScheduledSendPickerViewModel:delayed_attrs");
            hr1.r(tkc.c.remove("ScheduledSendPickerViewModel:delayed_attrs"));
            tkc.d.remove("ScheduledSendPickerViewModel:delayed_attrs");
            obj2 = null;
        }
        nd4 nd4 = obj2 instanceof nd4 ? (nd4) obj2 : null;
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.Y;
        if (nd4 != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(nd4.a);
            int i2 = instance.get(5);
            int i3 = instance.get(2);
            int i4 = instance.get(1);
            int i5 = instance.get(11);
            int i6 = instance.get(12);
            vlc e = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            vlc e2 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            vlc e3 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            List list = e.a;
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                v04 v04 = (v04) it.next();
                if (v04.o == i4 && v04.c == i3 && v04.b == i2) {
                    break;
                }
                i7++;
            }
            int i8 = i7 < 0 ? 0 : i7;
            List list2 = e2.b;
            Iterator it2 = list2.iterator();
            int i9 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i9 = -1;
                    break;
                } else if (((zie) it2.next()).a == i5) {
                    break;
                } else {
                    i9++;
                }
            }
            int i10 = i9 < 0 ? 0 : i9;
            List list3 = e3.c;
            Iterator it3 = list3.iterator();
            int i11 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (((zie) it3.next()).a == i6) {
                    i = i11;
                    break;
                } else {
                    i11++;
                }
            }
            vlc = new vlc(list, list2, list3, i8, i10, i < 0 ? 0 : i);
        } else {
            vlc = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
        }
        scheduledSendPickerViewModel.e.m((Object) null, new k04((v04) vlc.a.get(vlc.d), (zie) vlc.b.get(vlc.e), (zie) vlc.c.get(vlc.f)));
        scheduledSendPickerViewModel.c.m((Object) null, vlc);
        return jue.a;
    }
}
