package ksp.kos.ideaplugin.reference.context;

/**
 * Created on 08/10/16.
 *
 * @author ptasha
 */
public interface FileContextResolver {
    FileDuality ensureFile(String name);

    FileDuality resolveFile(String name);
}
