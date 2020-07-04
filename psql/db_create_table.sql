CREATE TABLE public.product
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default",
    cost integer NOT NULL,
    CONSTRAINT product_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.product
    OWNER to postgres;

GRANT ALL ON TABLE public.product TO postgres WITH GRANT OPTION;

INSERT INTO public.product(id, name, cost) VALUES (1, 'Orange', 30);
INSERT INTO public.product(id, name, cost) VALUES (2, 'Banana', 14);
INSERT INTO public.product(id, name, cost) VALUES (3, 'Apple', 35);

