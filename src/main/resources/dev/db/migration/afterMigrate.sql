/* Create demo ideas when project runs against dev profile */

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at, image_url)
VALUES ('Be nice to people',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Michelle Dany',
        'https://images.unsplash.com/flagged/photo-1574282893982-ff1675ba4900?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=70&q=80',
        10, '2019-02-12 10:08:15.919285',
        'https://images.unsplash.com/photo-1569063386755-cf0bb824312e?ixlib=rb-1.2.1&auto=format&fit=crop&w=320&q=80')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at, image_url)
VALUES ('Listen more',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Michelle Dany',
        'https://images.unsplash.com/photo-1531123897727-8f129e1688ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=63&q=80',
        10, '2019-02-12 10:08:15.919285',
        'https://images.unsplash.com/photo-1569063386755-cf0bb824312e?ixlib=rb-1.2.1&auto=format&fit=crop&w=320&q=80')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at, image_url)
VALUES ('Create browser extensions rather than entire apps',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Esther Lauder',
        'https://images.unsplash.com/photo-1531727991582-cfd25ce79613?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=63&q=80',
        3, '2019-02-12 10:08:15.919285',
        'https://images.unsplash.com/photo-1569063386755-cf0bb824312e?ixlib=rb-1.2.1&auto=format&fit=crop&w=320&q=80')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at, image_url)
VALUES ('Work smart and focused',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Esther Lauder',
        'https://images.unsplash.com/photo-1531475800102-75726f18e780?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=63&q=80',
        10, '2019-02-12 10:08:15.919285',
        'https://images.unsplash.com/photo-1569063386755-cf0bb824312e?ixlib=rb-1.2.1&auto=format&fit=crop&w=320&q=80')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at, image_url)
VALUES ('Buy groceries in time',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Demo User',
        'https://images.unsplash.com/flagged/photo-1574282893982-ff1675ba4900?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=70&q=80',
        10, '2019-02-12 10:08:15.919285',
        'https://images.unsplash.com/photo-1569063386755-cf0bb824312e?ixlib=rb-1.2.1&auto=format&fit=crop&w=320&q=80')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at)
VALUES ('Wear a mask no matter where you are outside',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Marie Grant',
        'https://images.unsplash.com/photo-1520689728498-7dd1a9814607?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=63&q=80',
        100, '2019-02-12 10:08:15.919285')
on conflict do nothing;

INSERT INTO ideas_pool (name, description, author_name, author_profile_image_url, likes, created_at)
VALUES ('Vote like your life depended on it',
        'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',
        'Marie Grant',
        'https://images.unsplash.com/photo-1520689728498-7dd1a9814607?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=63&q=80',
        100, '2019-02-12 10:08:15.919285')
on conflict do nothing;