
// STORAGE

package game.core;

import java.util.*;

// TODO : sorting

/**
 * <p>Storage class. Represents a categorized container for {@code Item} objects.
 * <p>Maintains type-based buckets for each registered item {@code Class}, such as {@code Weapon}, {@code Armor}, and
 * {@code Junk}.
 * <p>Provides type-safe API logic for adding, removing, querying, and retrieving {@code Storage} items.
 */
public final class Storage
{
    // ------------------- FIELDS -------------------

    /**
     * <p>A map of each item {@code Class} to their {@code Storage} buckets.
     * <p>Each key is the {@code Class} of a registered {@code Item} type, and each value is the {@code List} (bucket)
     * that stores instances of that type.
     */
    private final Map<Class<? extends Item>, List<? extends Item>> buckets;

    // ---------------- CONSTRUCTORS ----------------

    /**
     * <p>Constructs a new {@code Storage} instance and initializes its buckets.
     * <p>By default, creates buckets for items of {@code Weapon}, {@code Armor}, and {@code Junk} classes.
     */
    public Storage()
    {
        buckets = new HashMap<>();
        register(Weapon.class);
        register(Armor.class);
        register(Junk.class);
    }

    // --------------- PUBLIC METHODS ---------------

    /**
     * Adds the specified {@code Item} to its bucket.
     *
     * @param item the specified {@code Item}
     */
    public void add(Item item)
    {
        bucketOf(item).add(item);
    }

    /**
     * Removes the specified {@code Item} from its bucket, if present.
     *
     * @param item the specified {@code Item}
     */
    public void remove(Item item)
    {
        bucketOf(item).remove(item);
    }

    /**
     * Returns whether the specified {@code Item} is contained in its bucket.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item is in its bucket
     */
    public boolean contains(Item item)
    {
        return bucketOf(item).contains(item);
    }

    // -------------- PRIVATE METHODS ---------------

    /**
     * Registers a new bucket for the specified item {@code Class}.
     *
     * @param key the specified {@code Class}
     * @param <T> the {@code Class} of the item
     */
    private <T extends Item> void register(Class<T> key)
    {
        buckets.put(key, new ArrayList<T>());
    }

    /**
     * Returns the bucket {@code List} mapped to the specified item {@code Class}, cast to the correct generic type.
     *
     * @param key the specified {@code Class}
     * @param <T> the {@code Class} of the item
     * @return the reference to the {@code List} for the class
     * @throws IllegalArgumentException if the bucket is not registered
     */
    private <T extends Item> List<T> castBucket(Class<? extends Item> key)
    {
        @SuppressWarnings("unchecked")
        List<T> list = (List<T>) buckets.get(key);
        if (list == null) throw new IllegalArgumentException("cannot find bucket: " + key.getSimpleName()); // todo
        return list;
    }

    /**
     * Returns the bucket {@code List} for the specified item {@code Class} type.
     *
     * @param type the specified {@code Class}
     * @param <T> the {@code Class} of the item
     * @return the reference to the {@code List} for the class
     */
    private <T extends Item> List<T> bucket(Class<T> type)
    {
        return castBucket(type);
    }

    /**
     * Returns the bucket {@code List} associated with the specified {@code Item}.
     *
     * @param item the specified {@code Item}
     * @param <T> the {@code Class} of the item
     * @return the reference to the {@code List} for the class
     */
    private <T extends Item> List<T> bucketOf(T item)
    {
        return castBucket(item.baseType());
    }

    // ------------ ACCESSORS / MUTATORS ------------

    /**
     * Returns the {@code Item} at the specified index {@code int} within the bucket of the given {@code Class}.
     *
     * @param type the specified {@code Class}
     * @param index the specified index {@code int}
     * @param <T> the {@code Class} of the item
     * @return the reference to the {@code Item} at the index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public <T extends Item> T get(Class<T> type, int index)
    {
        List<T> bucket = bucket(type);
        if (index >= 0 && index < bucket.size()) return bucket.get(index);
        throw new IndexOutOfBoundsException("OOB at " + type.getSimpleName() + " index: " + index);
    }

    /**
     * Returns an unmodifiable {@code List} of the bucket for the specified {@code Class}.
     *
     * @param type the specified {@code Class}
     * @param <T> the {@code Class} of the item
     * @return an unmodifiable {@code List} containing all items of the class
     */
    public <T extends Item> List<T> getList(Class<T> type)
    {
        return Collections.unmodifiableList(bucket(type));
    }

    /**
     * Returns the number {@code int} of items stored in the bucket for the specified {@code Class}.
     *
     * @param type the specified {@code Class}
     * @return the number {@code int} of items in the bucket
     */
    public int getNumberOf(Class<? extends Item> type)
    {
        return bucket(type).size();
    }

    /**
     * Returns the total number {@code int} of items stored across all buckets.
     *
     * @return the number {@code int} of items stored in all buckets
     */
    public int getNumberOfItems()
    {
        return buckets.values()
                      .stream()
                      .mapToInt(List::size)
                      .sum();
    }

    // ----------------- DEBUGGING ------------------
}