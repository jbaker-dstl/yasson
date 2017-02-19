/*******************************************************************************
 * Copyright (c) 2016, 2017 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.internal.adapter;

import javax.json.bind.serializer.JsonbSerializer;
import java.lang.reflect.Type;

/**
 * Binding for user Serializer component.
 *
 * @author Roman Grigoriadi
 */
public class SerializerBinding<T> extends AbstractComponentBinding {

    private final JsonbSerializer<T> jsonbSerializer;

    /**
     * Creates a new instance.
     *
     * @param bindingType Generic type argument of serializer. Not null.
     * @param jsonbSerializer Serializer. Can be null.
     */
    public SerializerBinding(Type bindingType, JsonbSerializer<T> jsonbSerializer) {
        super(bindingType);
        this.jsonbSerializer = jsonbSerializer;
    }

    /**
     * Returns a serializer if any.
     *
     * @return Serializer.
     */
    public JsonbSerializer<T> getJsonbSerializer() {
        return jsonbSerializer;
    }

    /**
     * Class of user component.
     *
     * @return Component class.
     */
    @Override
    public Class<?> getComponentClass() {
        return jsonbSerializer.getClass();
    }
}
