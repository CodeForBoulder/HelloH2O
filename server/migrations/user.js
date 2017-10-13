exports.up = (knex) => {

  return knex.schema.createTableIfNotExists('user', (table) => {
    table.increments('id').primary();
    table.string('email').unique().notNullable();
    table.string('password').notNullable();
    table.timestamp('created_at').defaultTo(knex.fn.now());
    table.boolean('isActive').defaultTo(true);
  });
};

exports.down = (knex) => {
  return knex.schema.dropTable('user');
};
