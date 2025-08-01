package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b@\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0001\u0004\u0001\u0004\u0018\u00010\u0003¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isClosed", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "segment", "getSegment$annotations", "()V", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "equals", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SegmentOrClosed<S extends Segment<S>> {
    private final Object value;

    private /* synthetic */ SegmentOrClosed(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SegmentOrClosed m30boximpl(Object obj) {
        return new SegmentOrClosed(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <S extends Segment<S>> Object m31constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m32equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && hhd.f(obj, ((SegmentOrClosed) obj2).m38unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33equalsimpl0(Object obj, Object obj2) {
        return hhd.f(obj, obj2);
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* renamed from: getSegment-impl  reason: not valid java name */
    public static final S m34getSegmentimpl(Object obj) {
        if (obj != ConcurrentLinkedListKt.CLOSED) {
            return (Segment) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl  reason: not valid java name */
    public static final boolean m36isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m32equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35hashCodeimpl(this.value);
    }

    public String toString() {
        return m37toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m38unboximpl() {
        return this.value;
    }
}
