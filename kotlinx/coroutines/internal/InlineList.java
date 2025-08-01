package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a\u0001\u0003\u0001\u0004\u0018\u00010\u0002¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "plus", "Lkotlin/Function1;", "Ljue;", "action", "forEachReversed-impl", "(Ljava/lang/Object;Lu16;)V", "forEachReversed", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InlineList m20boximpl(Object obj) {
        return new InlineList(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <E> Object m21constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ Object m22constructorimpl$default(Object obj, int i, x54 x54) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m21constructorimpl(obj);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m23equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && hhd.f(obj, ((InlineList) obj2).m29unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m24equalsimpl0(Object obj, Object obj2) {
        return hhd.f(obj, obj2);
    }

    /* renamed from: forEachReversed-impl  reason: not valid java name */
    public static final void m25forEachReversedimpl(Object obj, u16 u16) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                u16.invoke(obj);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    u16.invoke(arrayList.get(size));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m26hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: plus-FjFbRPM  reason: not valid java name */
    public static final Object m27plusFjFbRPM(Object obj, E e) {
        if (obj == null) {
            return m21constructorimpl(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m21constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m21constructorimpl(arrayList);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m28toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m23equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m26hashCodeimpl(this.holder);
    }

    public String toString() {
        return m28toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m29unboximpl() {
        return this.holder;
    }
}
