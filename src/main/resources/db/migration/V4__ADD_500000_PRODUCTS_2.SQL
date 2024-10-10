DO $$
    DECLARE
        i INT;
    BEGIN
        FOR i IN 1..250000 LOOP
            INSERT INTO Product (
                product_name,
                description,
                price,
                stock_quantity,
                category,
                manufacturer,
                weight,
                dimensions,
                color,
                material,
                sku,
                barcode,
                supplier_id,
                brand,
                release_date,
                expiration_date,
                created_at,
                updated_at,
                discontinued,
                warranty_period,
                returnable,
                recyclable,
                energy_rating,
                country_of_origin,
                shipping_weight,
                package_dimensions,
                max_temperature,
                min_temperature,
                certifications,
                hazardous_material,
                battery_life_hours,
                power_source,
                voltage,
                amperage,
                frequency,
                connectivity,
                wireless,
                bluetooth,
                warranty_terms,
                care_instructions,
                cleaning_instructions,
                packaging_type,
                recyclable_packaging,
                water_resistant,
                waterproof,
                shock_resistant,
                assembly_required,
                assembly_instructions,
                user_manual,
                safety_instructions,
                age_restriction,
                customer_rating,
                number_of_reviews,
                average_review_score,
                product_url,
                video_url,
                image_url,
                thumbnail_url,
                promotional_text,
                discount_percentage,
                sale_start_date,
                sale_end_date,
                max_order_quantity,
                min_order_quantity,
                lead_time_days,
                backorder_allowed,
                restock_date,
                restock_quantity,
                product_weight,
                shipping_class,
                fulfillment_center,
                product_condition,
                refurbished,
                used,
                limited_edition,
                gift_wrap_available,
                gift_message_available,
                subscription_available,
                subscription_interval,
                subscription_price,
                customizability_options,
                seasonal,
                eco_friendly,
                carbon_footprint,
                time_to_assemble_minutes,
                digital_download,
                license_key,
                operating_systems_supported,
                compatible_with,
                languages_supported,
                update_frequency,
                available_languages,
                digital_rights_management,
                upc_code,
                ean_code,
                mpn_code,
                isbn_code,
                model_number
            ) VALUES (
                         'Product ' || FLOOR(random() * 1000), -- product_name
                         'Description for product ' || FLOOR(random() * 1000), -- description
                         ROUND(CAST(random() * 500 + 1 AS numeric), 2), -- price (random price between 1 and 500)
                         FLOOR(random() * 1000), -- stock_quantity (random stock between 0 and 1000)
                         'Gadgets', -- category (can randomize this if needed)
                         'Manufacturer Inc.', -- manufacturer (can be randomized)
                         ROUND(CAST(random() * 5 + 0.5 AS numeric), 2), -- weight (random weight between 0.5 and 5.5)
                         FLOOR(random() * 50 + 1) || 'x' || FLOOR(random() * 50 + 1) || 'x' || FLOOR(random() * 50 + 1) || ' cm', -- dimensions
                         'Red', -- color (can be randomized)
                         'Plastic', -- material
                         'SKU' || FLOOR(random() * 100000), -- sku (random SKU)
                         'BAR' || FLOOR(random() * 1000000), -- barcode (random barcode)
                         FLOOR(random() * 100 + 1), -- supplier_id (random supplier between 1 and 100)
                         'Brand ' || FLOOR(random() * 100), -- brand
                         CURRENT_DATE + (INTERVAL '1 day' * (FLOOR(random() * 1000 - 500))), -- release_date (random date within ~500 days of today)
                         CURRENT_DATE + (INTERVAL '1 day' * FLOOR(random() * 1000)), -- expiration_date (random future date)
                         CURRENT_TIMESTAMP, -- created_at
                         CURRENT_TIMESTAMP, -- updated_at
                         (random() > 0.5), -- discontinued (random boolean)
                         FLOOR(random() * 36 + 1), -- warranty_period (random warranty between 1 and 36 months)
                         (random() > 0.5), -- returnable (random boolean)
                         (random() > 0.5), -- recyclable (random boolean)
                         'A+' || FLOOR(random() * 5 + 1), -- energy_rating (random energy rating)
                         'USA', -- country_of_origin
                         ROUND(CAST(random() * 5 + 0.5 AS numeric), 2), -- shipping_weight (random shipping weight)
                         FLOOR(random() * 30 + 1) || 'x' || FLOOR(random() * 30 + 1) || 'x' || FLOOR(random() * 30 + 1) || ' cm', -- package_dimensions
                         ROUND(CAST(random() * 100 AS numeric), 2), -- max_temperature (random max temperature)
                         ROUND(CAST(random() * -30 AS numeric), 2), -- min_temperature (random min temperature)
                         'Certification ' || FLOOR(random() * 100), -- certifications (random)
                         (random() > 0.5), -- hazardous_material (random boolean)
                         ROUND(CAST(random() * 100 AS numeric), 2), -- battery_life_hours (random battery life)
                         'Battery', -- power_source (fixed)
                         ROUND(CAST(random() * 240 + 10 AS numeric), 2), -- voltage (random voltage)
                         ROUND(CAST(random() * 10 AS numeric), 2), -- amperage (random amperage)
                         ROUND(CAST(random() * 100 AS numeric), 2), -- frequency (random frequency)
                         'Wi-Fi', -- connectivity
                         (random() > 0.5), -- wireless (random boolean)
                         (random() > 0.5), -- bluetooth (random boolean)
                         'Standard warranty', -- warranty_terms (fixed)
                         'Clean with a damp cloth', -- care_instructions (fixed)
                         'Mild soap and water', -- cleaning_instructions (fixed)
                         'Box', -- packaging_type (fixed)
                         (random() > 0.5), -- recyclable_packaging (random boolean)
                         (random() > 0.5), -- water_resistant (random boolean)
                         (random() > 0.5), -- waterproof (random boolean)
                         (random() > 0.5), -- shock_resistant (random boolean)
                         (random() > 0.5), -- assembly_required (random boolean)
                         NULL, -- assembly_instructions
                         'Included manual', -- user_manual (fixed)
                         'General safety instructions', -- safety_instructions (fixed)
                         FLOOR(random() * 18 + 12), -- age_restriction (random age restriction between 12 and 30)
                         ROUND(CAST(random() * 5 AS numeric), 2), -- customer_rating (random rating between 0 and 5)
                         FLOOR(random() * 1000), -- number_of_reviews (random review count between 0 and 1000)
                         ROUND(CAST(random() * 5 AS numeric), 2), -- average_review_score (random average score between 0 and 5)
                         'https://example.com/product-' || FLOOR(random() * 1000), -- product_url
                         'https://example.com/video-' || FLOOR(random() * 1000), -- video_url
                         'https://example.com/image-' || FLOOR(random() * 1000), -- image_url
                         'https://example.com/thumb-' || FLOOR(random() * 1000), -- thumbnail_url
                         'Limited-time offer', -- promotional_text (fixed)
                         ROUND(CAST(random() * 50 AS numeric), 2), -- discount_percentage (random discount between 0 and 50%)
                         CURRENT_DATE + (INTERVAL '1 day' * FLOOR(random() * 100)), -- sale_start_date (random future date)
                         CURRENT_DATE + (INTERVAL '1 day' * FLOOR(random() * 100 + 100)), -- sale_end_date (random future date)
                         FLOOR(random() * 10 + 1), -- max_order_quantity (random order limit)
                         FLOOR(random() * 5 + 1), -- min_order_quantity (random order minimum)
                         FLOOR(random() * 30 + 1), -- lead_time_days (random lead time between 1 and 30 days)
                         (random() > 0.5), -- backorder_allowed (random boolean)
                         CURRENT_DATE + (INTERVAL '1 day' * FLOOR(random() * 200)), -- restock_date (random future date)
                         FLOOR(random() * 500 + 1), -- restock_quantity (random restock quantity)
                         ROUND(CAST(random() * 5 AS numeric), 2), -- product_weight (random weight between 0 and 5)
                         'Standard', -- shipping_class (fixed)
                         'Fulfillment Center ' || FLOOR(random() * 10), -- fulfillment_center (random fulfillment center)
                         'New', -- product_condition (fixed)
                         (random() > 0.5), -- refurbished (random boolean)
                         (random() > 0.5), -- used (random boolean)
                         (random() > 0.5), -- limited_edition (random boolean)
                         (random() > 0.5), -- gift_wrap_available (random boolean)
                         (random() > 0.5), -- gift_message_available (random boolean)
                         (random() > 0.5), -- subscription_available (random boolean)
                         FLOOR(random() * 12 + 1), -- subscription_interval (random interval between 1 and 12 months)
                         ROUND(CAST(random() * 100 AS numeric), 2), -- subscription_price (random subscription price)
                         'Custom options available', -- customizability_options (fixed)
                         (random() > 0.5), -- seasonal (random boolean)
                         (random() > 0.5), -- eco_friendly (random boolean)
                         ROUND(CAST(random() * 100 AS numeric), 2), -- carbon_footprint (random carbon footprint)
                         FLOOR(random() * 60), -- time_to_assemble_minutes (random time between 0 and 60 minutes)
                         (random() > 0.5), -- digital_download (random boolean)
                         'KEY' || FLOOR(random() * 100000), -- license_key (random key)
                         'Windows, macOS', -- operating_systems_supported (fixed)
                         'Compatible with most devices', -- compatible_with (fixed)
                         'English, French, Spanish', -- languages_supported (fixed)
                         'Monthly', -- update_frequency (fixed)
                         'English, Spanish', -- available_languages (fixed)
                         'DRM Protected', -- digital_rights_management (fixed)
                         'UPC' || FLOOR(random() * 100000), -- upc_code (random UPC)
                         'EAN' || FLOOR(random() * 100000), -- ean_code (random EAN)
                         'MPN' || FLOOR(random() * 100000), -- mpn_code (random MPN)
                         'ISBN' || FLOOR(random() * 100000), -- isbn_code (random ISBN)
                         'MODEL' || FLOOR(random() * 100000) -- model_number (random model number)
                     );

                IF i % 10000 = 0 THEN
                    PERFORM pg_sleep(0.5);  -- Sleep to avoid heavy load
                END IF;

            END LOOP;
    END $$;