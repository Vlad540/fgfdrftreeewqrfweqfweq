package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import me.leolin.shortcutbadger.BuildConfig;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003H\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\u000b*\u00020\u0003H\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u000b\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004R\u0013\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8\u0002X\u0004¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "", "maxCapacity", "Lkotlin/Function1;", "create", "<init>", "(ILu16;)V", "tryForbidNewElements", "()I", "", "isClosed", "(I)Z", "allocate", "()Z", "", "close", "()Ljava/util/List;", "", "stateRepresentation$kotlinx_coroutines_core", "()Ljava/lang/String;", "stateRepresentation", "toString", "I", "Lu16;", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class OnDemandAllocatingPool<T> {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final u16 create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    public OnDemandAllocatingPool(int i, u16 u16) {
        this.maxCapacity = i;
        this.create = u16;
        this.elements = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i) {
        return (Integer.MIN_VALUE & i) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, u16 u16) {
        while (true) {
            u16.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater controlState$volatile$FU2 = controlState$volatile$FU;
        do {
            i = controlState$volatile$FU2.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater controlState$volatile$FU2 = controlState$volatile$FU;
        do {
            i = controlState$volatile$FU2.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, i + 1));
        getElements().set(i, this.create.invoke(Integer.valueOf(i)));
        return true;
    }

    public final List<T> close() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater controlState$volatile$FU2 = controlState$volatile$FU;
        while (true) {
            i = controlState$volatile$FU2.get(this);
            if ((i & Integer.MIN_VALUE) == 0) {
                if (controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        fz6 S = gwf.S(0, i);
        ArrayList arrayList = new ArrayList(q23.H(S, 10));
        Iterator it = S.iterator();
        while (it.hasNext()) {
            int a = ((ez6) it).a();
            do {
                andSet = getElements().getAndSet(a, (Object) null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i = controlState$volatile$FU.get(this);
        fz6 S = gwf.S(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(q23.H(S, 10));
        Iterator it = S.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((ez6) it).a()));
        }
        return hr1.g(arrayList.toString(), (i & Integer.MIN_VALUE) != 0 ? "[closed]" : BuildConfig.FLAVOR);
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
